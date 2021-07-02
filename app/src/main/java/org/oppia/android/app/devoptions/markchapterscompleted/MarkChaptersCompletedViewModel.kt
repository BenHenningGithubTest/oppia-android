package org.oppia.android.app.devoptions.markchapterscompleted

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import org.oppia.android.app.fragment.FragmentScope
import org.oppia.android.app.model.ProfileId
import org.oppia.android.app.model.StorySummary
import org.oppia.android.app.viewmodel.ObservableViewModel
import org.oppia.android.domain.oppialogger.OppiaLogger
import org.oppia.android.domain.topic.ModifyLessonProgressController
import org.oppia.android.util.data.AsyncResult
import org.oppia.android.util.data.DataProviders.Companion.toLiveData
import javax.inject.Inject

/** The ViewModel for [MarkChaptersCompletedActivity]. */
@FragmentScope
class MarkChaptersCompletedViewModel @Inject constructor(
  private val oppiaLogger: OppiaLogger,
  private val modifyLessonProgressController: ModifyLessonProgressController
) : ObservableViewModel() {

  private var internalProfileId: Int = -1

  val storySummaryLiveData: LiveData<List<StorySummaryViewModel>> by lazy {
    Transformations.map(storyListLiveData, ::processStoryList)
  }

  private val storyListLiveData: LiveData<List<StorySummary>> by lazy { getStoryList() }

  private fun getStoryList(): LiveData<List<StorySummary>> {
    return Transformations.map(storyListResultLiveData, ::processStoryListResult)
  }

  private val storyListResultLiveData: LiveData<AsyncResult<List<StorySummary>>> by lazy {
    modifyLessonProgressController
      .getAllStoriesWithProgress(ProfileId.newBuilder().setInternalId(internalProfileId).build())
      .toLiveData()
  }

  private fun processStoryListResult(
    storyList: AsyncResult<List<StorySummary>>
  ): List<StorySummary> {
    if (storyList.isFailure()) {
      oppiaLogger.e(
        "MarkChaptersCompletedFragment",
        "Failed to retrieve storyList",
        storyList.getErrorOrNull()!!
      )
    }
    return storyList.getOrDefault(mutableListOf())
  }

  private fun processStoryList(storyList: List<StorySummary>): List<StorySummaryViewModel> {
    val itemList = mutableListOf<StorySummaryViewModel>()
    storyList.forEach { storySummary ->
      itemList.add(StorySummaryViewModel(storySummary))
    }
    return itemList
  }

  fun setInternalProfileId(internalProfileId: Int) {
    this.internalProfileId = internalProfileId
  }
}
