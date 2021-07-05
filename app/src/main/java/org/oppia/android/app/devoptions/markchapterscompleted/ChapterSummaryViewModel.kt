package org.oppia.android.app.devoptions.markchapterscompleted

import org.oppia.android.app.model.ChapterPlayState
import org.oppia.android.app.model.ChapterSummary

/** [MarkChaptersCompletedItemViewModel] for displaying a chapter summary. */
class ChapterSummaryViewModel(
  val chapterIndex: Int,
  val chapterSummary: ChapterSummary,
  val nextStoryIndex: Int,
  val storyId: String,
  val topicId: String
) : MarkChaptersCompletedItemViewModel() {
  /**
   * Function to check if a chapter is completed or not. It is used in
   * [MarkChaptersCompletedFragmentPresenter] to decide if a chapter should be checked and disabled.
   */
  fun checkIfChapterIsCompleted(): Boolean =
    chapterSummary.chapterPlayState == ChapterPlayState.COMPLETED
}
