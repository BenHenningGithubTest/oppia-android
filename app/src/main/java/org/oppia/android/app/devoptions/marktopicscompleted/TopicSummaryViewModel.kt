package org.oppia.android.app.devoptions.marktopicscompleted

import androidx.lifecycle.ViewModel
import org.oppia.android.app.model.Topic
import org.oppia.android.app.viewmodel.ObservableViewModel

/** [ViewModel] for displaying a topic summary. */
class TopicSummaryViewModel(
  val topic: Topic
) : ObservableViewModel()