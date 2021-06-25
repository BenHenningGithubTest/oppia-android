package org.oppia.android.scripts

/** Lists of files which should be exepmted for the different script checks. */
object ExemptionsList {
  /** List of files which should be exempted for the test file check. */
  val TEST_FILE_CHECK_EXEMPTIONS_LIST = listOf(
    "TestCoroutineDispatcherTestBase.kt",
    "TestEnvironmentConfig.kt",
    "OppiaTestRule.kt",
    "RobolectricModule.kt",
    "IsOnRobolectric.kt",
    "KonfettiViewMatcher.kt",
    "ImageViewMatcher.kt",
    "EditTextInputAction.kt",
    "GenericViewMatchers.kt",
    "MockExplorationService.kt",
    "MockSubtopicService.kt",
    "MockClassroomService.kt",
    "MockStoryService.kt",
    "MockQuestionPlayerService.kt",
    "MockTopicService.kt",
    "RetrofitTestModule.kt",
    "MockFeedbackReportingService.kt",
    "ApiMockLoader.kt",
    "MockConceptCardService.kt",
    "OppiaTestRunner.kt",
    "FakeOppiaClockModule.kt",
    "FakeSystemClock.kt",
    "OppiaTestAnnotations.kt",
    "TestLogReportingModule.kt",
    "TestImageLoaderModule.kt",
    "RichTextViewMatcher.kt",
    "MockitoKotlinHelper.kt",
    "TestCoroutineDispatchers.kt",
    "TestDispatcherModule.kt",
    "TestCoroutineDispatchersRobolectricImpl.kt",
    "BackgroundTestDispatcher.kt",
    "BlockingTestDispatcher.kt",
    "TestCoroutineDispatchersEspressoImpl.kt",
    "AssertionHelpers.kt",
    "InteractionObjectTestBuilder.kt",
    "StateDeck.kt",
    "StateList.kt",
    "StateGraph.kt",
    "FakeLogUploader.kt",
    "FakeExpirationMetaDataRetriever.kt",
    "ExpirationMetaDataRetrieverTestModule.kt",
    "ExpirationMetaDataRetriever.kt",
    "ExpirationMetaDataRetrieverModule.kt",
    "ExpirationMetaDataRetrieverImpl.kt",
    "LogUploadWorkerModule.kt",
    "LogUploadWorkerFactory.kt",
    "WorkManagerConfigurationModule.kt",
    "LogStorageModule.kt",
    "UncaughtExceptionLoggerModule.kt",
    "ApplicationStartupListener.kt",
    "ClassificationResult.kt",
    "InteractionClassifier.kt",
    "RuleClassifier.kt",
    "GenericInteractionClassifier.kt",
    "RuleClassifierProvider.kt",
    "ImageClickInputModule.kt",
    "NumericInputRuleModule.kt",
    "GenericRuleClassifier.kt",
    "ContinueModule.kt",
    "RatioInputModule.kt",
    "InteractionObjectTypeExtractorRepository.kt",
    "ItemSelectionInputModule.kt",
    "DragDropSortInputModule.kt",
    "DragDropSortInputHasElementXBeforeElementYClassifierProvider.kt",
    "DragDropSortInputHasElementXAtPositionYClassifierProvider.kt",
    "MultipleChoiceInputModule.kt",
    "FractionInputModule.kt",
    "TextInputRuleModule.kt",
    "NumberWithUnitsRuleModule.kt",
    "RuleQualifiers.kt",
    "InteractionsModule.kt",
    "FeedbackReportingModule.kt",
    "QuestionSessionMetrics.kt",
    "QuestionRetriever.kt",
    "QuestionTrainingConstantsProvider.kt",
    "QuestionAssessmentProgress.kt",
    "QuestionConstantsProvider.kt",
    "QuestionAssessmentCalculation.kt",
    "ExplorationProgress.kt",
    "ExplorationRetriever.kt",
    "JsonAssetRetriever.kt",
    "FloatExtensions.kt",
    "FractionExtensions.kt",
    "ConceptCardRetriever.kt",
    "PrimeTopicAssetsController.kt",
    "PrimeTopicAssetsControllerModule.kt",
    "RevisionCardRetriever.kt",
    "PrimeTopicAssetsControllerImpl.kt",
    "StatusBarColor.kt",
    "OppiaClockModule.kt",
    "OppiaClockImpl.kt",
    "OppiaClock.kt",
    "LogLevel.kt",
    "EventLogger.kt",
    "ConsoleLogger.kt",
    "LoggingAnnotations.kt",
    "FirebaseEventLogger.kt",
    "FirebaseLogUploader.kt",
    "FirebaseExceptionLogger.kt",
    "FirebaseLogUploaderModule.kt",
    "LogReportingModule.kt",
    "LogUploader.kt",
    "ExceptionLogger.kt",
    "LoggerModule.kt",
    "ExplorationHtmlParserEntityType.kt",
    "BulletTagHandler.kt",
    "HtmlParserEntityTypeModule.kt",
    "BlockSvgDrawableTranscoder.kt",
    "SvgBlurTransformation.kt",
    "SvgPictureDrawable.kt",
    "BlockPictureDrawable.kt",
    "ScalableVectorGraphic.kt",
    "SvgDecoder.kt",
    "TextSvgDrawableTranscoder.kt",
    "GlideImageLoader.kt",
    "ImageLoader.kt",
    "TextPictureDrawable.kt",
    "ImageAssetFetcher.kt",
    "TestGlideImageLoader.kt",
    "ImageParsingAnnotations.kt",
    "ImageTargets.kt",
    "BitmapBlurTransformation.kt",
    "GlideImageLoaderModule.kt",
    "RepositoryGlideModule.kt",
    "ImageParsingModule.kt",
    "RepositoryModelLoader.kt",
    "BitmapBlurrer.kt",
    "ContextExtensions.kt",
    "AccessibilityTestModule.kt",
    "AccessibilityProdModule.kt",
    "AccessibilityCheckerImpl.kt",
    "AccessibilityChecker.kt",
    "FakeAccessibilityChecker.kt",
    "ConcurrentCollections.kt",
    "BlockingDispatcher.kt",
    "BackgroundDispatcher.kt",
    "DispatcherModule.kt",
    "GcsResourceAnnotations.kt",
    "GcsResourceModule.kt",
    "CacheAssetsLocally.kt",
    "TopicListToCache.kt",
    "CachingTestModule.kt",
    "LoadLessonProtosFromAssets.kt",
    "LoadImagesFromAssets.kt",
    "CachingModule.kt",
    "AssetRepository.kt",
    "AsyncDataSubscriptionManager.kt",
    "DataProvidersInjector.kt",
    "DataProvidersInjectorProvider.kt",
    "DataProvider.kt",
    "ProfileProgressSpanCount.kt",
    "PlayerSplitScreenTesting.kt",
    "ActivityScope.kt",
    "ActivityModule.kt",
    "ActivityComponent.kt",
    "InjectableAppCompatActivity.kt",
    "DownloadsTabFragmentPresenter.kt",
    "MyDownloadsTab.kt",
    "MyDownloadsActivityPresenter.kt",
    "MyDownloadsActivity.kt",
    "DownloadsTabFragment.kt",
    "UpdatesTabFragmentPresenter.kt",
    "MyDownloadsFragmentPresenter.kt",
    "MyDownloadsViewPagerAdapter.kt",
    "UpdatesTabFragment.kt",
    "ProfilePictureActivityViewModel.kt",
    "ProfilePictureDialogInterface.kt",
    "RouteToCompletedStoryListListener.kt",
    "ProfileProgressActivityPresenter.kt",
    "ProfileProgressFragmentPresenter.kt",
    "ProfileProgressViewModel.kt",
    "ProfileProgressItemViewModel.kt",
    "RouteToOngoingTopicListListener.kt",
    "ProfilePictureClickListener.kt",
    "ProfilePictureEditDialogFragment.kt",
    "RecentlyPlayedStorySummaryViewModel.kt",
    "ProfilePictureActivityPresenter.kt",
    "ProfileProgressHeaderViewModel.kt",
    "ConceptCardFragmentTestActivity.kt",
    "TopicRevisionTestActivity.kt",
    "TestFontScaleConfigurationUtilActivityPresenter.kt",
    "ExplorationInjectionActivity.kt",
    "BindableAdapterTestDataModel.kt",
    "ImageRegionSelectionTestFragment.kt",
    "AudioFragmentTestActivity.kt",
    "ProfileChooserFragmentTestActivityPresenter.kt",
    "ProfileChooserFragmentTestActivity.kt",
    "BindableAdapterTestFragmentPresenter.kt",
    "HomeFragmentTestActivity.kt",
    "HomeTestActivityPresenter.kt",
    "HomeTestActivity.kt",
    "LessonThumbnailImageViewTestFragment.kt",
    "ExplorationTestActivityPresenter.kt",
    "LessonThumbnailImageViewTestActivity.kt",
    "DragDropTestActivityPresenter.kt",
    "TopicTestActivity.kt",
    "TopicRevisionTestActivityPresenter.kt",
    "ConceptCardFragmentTestActivityPresenter.kt",
    "ExplorationTestActivity.kt",
    "NavigationDrawerTestActivity.kt",
    "HtmlParserTestActivity.kt",
    "BindableAdapterTestActivity.kt",
    "BindableAdapterTestViewModel.kt",
    "BindableAdapterTestFragment.kt",
    "ImageRegionSelectionTestActivity.kt",
    "AudioFragmentTestActivityPresenter.kt",
    "ImageRegionSelectionTestFragmentPresenter.kt",
    "ViewComponent.kt",
    "ViewScope.kt",
    "ViewPagerSlide.kt",
    "OnboardingViewPagerViewModel.kt",
    "OnboardingSlideFinalViewModel.kt",
    "RouteToProfileListListener.kt",
    "OnboardingFragmentPresenter.kt",
    "OnboardingActivityPresenter.kt",
    "OnboardingViewModel.kt",
    "OnboadingSlideViewModel.kt",
    "OnboardingNavigationListener.kt",
    "ApplicationInjectorProvider.kt",
    "ApplicationComponent.kt",
    "ApplicationModule.kt",
    "ActivityComponentFactory.kt",
    "ApplicationStartupListenerModule.kt",
    "ApplicationContext.kt",
    "OppiaApplication.kt",
    "ApplicationInjector.kt",
    "AdministratorControlsViewModel.kt",
    "RouteToProfileListListener.kt",
    "LoadAppVersionListener.kt",
    "ShowLogoutDialogListener.kt",
    "RouteToAppVersionListener.kt",
    "AdministratorControlsActivityPresenter.kt",
    "LogoutDialogFragment.kt",
    "AdministratorControlsGeneralViewModel.kt",
    "AdministratorControlsAppInformationViewModel.kt",
    "AdministratorControlsDownloadPermissionsViewModel.kt",
    "AdministratorControlsProfileViewModel.kt",
    "AdministratorControlsItemViewModel.kt",
    "AdministratorControlsAccountActionsViewModel.kt",
    "LoadProfileListListener.kt",
    "AppVersionViewModel.kt",
    "AppVersionFragment.kt",
    "AppVersionActivityPresenter.kt",
    "AppVersionFragmentPresenter.kt",
    "AdministratorControlsFragmentPresenter.kt",
    "OptionsActivityPresenter.kt",
    "OptionsFragmentPresenter.kt",
    "LanguageRadioButtonListener.kt",
    "AppLanguageActivityPresenter.kt",
    "LanguageSelectionViewModel.kt",
    "LoadAudioLanguageListListener.kt",
    "ReadingTextSizeFragmentPresenter.kt",
    "LanguageItemViewModel.kt",
    "LoadAppLanguageListListener.kt",
    "OptionControlsViewModel.kt",
    "AudioLanguageFragmentPresenter.kt",
    "ReadingTextSizeActivityPresenter.kt",
    "ReadingTextSizeSelectionViewModel.kt",
    "OptionsAppLanguageViewModel.kt",
    "OptionsReadingTextSizeViewModel.kt",
    "TextSizeRadioButtonListener.kt",
    "AudioLanguageActivityPresenter.kt",
    "RouteToAudioLanguageListListener.kt",
    "LoadReadingTextSizeListener.kt",
    "TextSizeItemViewModel.kt",
    "RouteToAppLanguageListListener.kt",
    "OptionsItemViewModel.kt",
    "AppLanguageFragmentPresenter.kt",
    "RouteToReadingTextSizeListener.kt",
    "OptionsAudioLanguageViewModel.kt",
    "HintsAndSolutionItemViewModel.kt",
    "SolutionViewModel.kt",
    "HintsViewModel.kt",
    "ExpandedHintListIndexListener.kt",
    "RevealHintListener.kt",
    "HintsAndSolutionDialogFragment.kt",
    "HintsDividerViewModel.kt",
    "RevealSolutionDialogFragment.kt",
    "HintsAndSolutionDialogFragmentPresenter.kt",
    "RevealSolutionInterface.kt",
    "HintsAndSolutionListener.kt",
    "UserAppHistoryViewModel.kt",
    "RouteToRecentlyPlayedListener.kt",
    "RouteToTopicListener.kt",
    "HomeActivityPresenter.kt",
    "HomeItemViewModel.kt",
    "AllTopicsViewModel.kt",
    "TopicSummaryClickListener.kt",
    "HomeFragmentPresenter.kt",
    "RouteToTopicPlayStoryListener.kt",
    "HomeFragment.kt",
    "RecentlyPlayedActivityPresenter.kt",
    "RecentlyPlayedFragmentPresenter.kt",
    "OngoingStoryClickListener.kt",
    "RecentlyPlayedItemViewModel.kt",
    "RecentlyPlayedActivity.kt",
    "SectionTitleViewModel.kt",
    "OngoingStoryViewModel.kt",
    "OngoingListAdapter.kt",
    "ComingSoonTopicsListView.kt",
    "ComingSoonTopicsViewModel.kt",
    "ComingSoonTopicListViewModel.kt",
    "PromotedStoryListView.kt",
    "HomeViewModel.kt",
    "RouteToExplorationListener.kt",
    "ViewBindingShimImpl.kt",
    "ViewComponentFactory.kt",
    "IntentFactoryShimImpl.kt",
    "IntentFactoryShim.kt",
    "IntentFactoryShimModule.kt",
    "ViewBindingShim.kt",
    "ViewBindingShimModule.kt",
    "StoryActivityPresenter.kt",
    "StoryHeaderViewModel.kt",
    "StoryItemViewModel.kt",
    "StoryChapterSummaryViewModel.kt",
    "StoryViewModel.kt",
    "ExplorationSelectionListener.kt",
    "StoryFragmentPresenter.kt",
    "StoryFragmentScroller.kt",
    "AutomaticAppDeprecationNoticeDialogFragment.kt",
    "DeprecationNoticeExitAppListener.kt",
    "AutomaticAppDeprecationNoticeDialogFragmentPresenter.kt",
    "PinPasswordViewModel.kt",
    "ResetPinDialogFragment.kt",
    "ProfileRouteDialogInterface.kt",
    "ResetPinDialogFragmentPresenter.kt",
    "AdminSettingsViewModel.kt",
    "AddProfileViewModel.kt",
    "AdminAuthActivityPresenter.kt",
    "ProfileChooserActivityPresenter.kt",
    "RouteToAdminPinListener.kt",
    "AddProfileActivityPresenter.kt",
    "ProfileChooserFragmentPresenter.kt",
    "ProfileChooserViewModel.kt",
    "ProfileChooserActivity.kt",
    "AdminPinViewModel.kt",
    "AdminSettingsDialogFragment.kt",
    "AdminPinActivityPresenter.kt",
    "AdminAuthEnum.kt",
    "AdminAuthViewModel.kt",
    "AdminSettingsDialogFragmentPresenter.kt",
    "ResetPinViewModel.kt",
    "PinPasswordActivityPresenter.kt",
    "SegmentedCircularProgressView.kt",
    "RatioInputInteractionView.kt",
    "FractionInputInteractionView.kt",
    "TextInputInteractionView.kt",
    "NumericInputInteractionView.kt",
    "OngoingTopicItemViewModel.kt",
    "OngoingTopicListActivityPresenter.kt",
    "OngoingTopicListFragmentPresenter.kt",
    "OngoingTopicListViewModel.kt",
    "OngoingTopicListFragment.kt",
    "HelpActivityPresenter.kt",
    "HelpFragmentPresenter.kt",
    "HelpItemViewModel.kt",
    "FAQListViewModel.kt",
    "RouteToFAQSingleListener.kt",
    "FAQHeaderViewModel.kt",
    "FAQContentViewModel.kt",
    "FAQItemViewModel.kt",
    "FAQListFragmentPresenter.kt",
    "FAQListActivity.kt",
    "FAQSingleActivityPresenter.kt",
    "FAQListActivityPresenter.kt",
    "RouteToFAQListListener.kt",
    "HelpListViewModel.kt",
    "HelpItems.kt",
    "StartSnapHelper.kt",
    "OnItemDragListener.kt",
    "DragAndDropItemFacilitator.kt",
    "DividerItemDecorator.kt",
    "OnDragEndedListener.kt",
    "NavigationDrawerHeaderViewModel.kt",
    "ExitProfileDialogFragment.kt",
    "NavigationDrawerItem.kt",
    "NavigationDrawerFooterViewModel.kt",
    "NavigationDrawerFragment.kt",
    "ExitProfileDialogInterface.kt",
    "RouteToProfileProgressListener.kt",
    "NavigationDrawerFragmentPresenter.kt",
    "FontScaleConfigurationUtil.kt",
    "OnClickableAreaClickedListener.kt",
    "RegionClickEvent.kt",
    "ClickableAreasImage.kt",
    "KeyboardHelper.kt",
    "LifecycleSafeTimerFactory.kt",
    "SplitScreenManager.kt",
    "TextInputEditTextHelper.kt",
    "CompletedStoryListFragmentPresenter.kt",
    "CompletedStoryItemViewModel.kt",
    "CompletedStoryListFragment.kt",
    "CompletedStoryListActivityPresenter.kt",
    "CompletedStoryListViewModel.kt",
    "StringToNumberParser.kt",
    "ViewModelProvider.kt",
    "ObservableArrayList.kt",
    "ViewModelBridgeFactory.kt",
    "ObservableViewModel.kt",
    "SplashActivityPresenter.kt",
    "FragmentComponent.kt",
    "InjectableDialogFragment.kt",
    "FragmentModule.kt",
    "FragmentScope.kt",
    "InjectableFragment.kt",
    "SubtopicSelector.kt",
    "TopicPracticeItemViewModel.kt",
    "TopicPracticeSubtopicViewModel.kt",
    "TopicPracticeFooterViewModel.kt",
    "TopicPracticeHeaderViewModel.kt",
    "TopicPracticeFragmentPresenter.kt",
    "TopicPracticeViewModel.kt",
    "RouteToQuestionPlayerListener.kt",
    "TopicRevisionFragmentPresenter.kt",
    "TopicRevisionViewModel.kt",
    "RevisionSubtopicSelector.kt",
    "TopicRevisionItemViewModel.kt",
    "PracticeTabModule.kt",
    "TopicActivityPresenter.kt",
    "RouteToStoryListener.kt",
    "TopicInfoViewModel.kt",
    "TopicInfoFragmentPresenter.kt",
    "TopicTab.kt",
    "EnablePracticeTab.kt",
    "HintsAndSolutionQuestionManagerFragmentPresenter.kt",
    "HintsAndSolutionQuestionManagerListener.kt",
    "QuestionPlayerFragmentPresenter.kt",
    "QuestionPlayerFragment.kt",
    "QuestionPlayerActivityPresenter.kt",
    "QuestionPlayerViewModel.kt",
    "HintsAndSolutionQuestionManagerFragment.kt",
    "ViewPagerAdapter.kt",
    "TopicViewModel.kt",
    "RouteToRevisionCardListener.kt",
    "RevisionCardActivityPresenter.kt",
    "RevisionCardFragmentPresenter.kt",
    "ReturnToTopicClickListener.kt",
    "RevisionCardViewModel.kt",
    "ConceptCardListener.kt",
    "ConceptCardFragmentPresenter.kt",
    "ConceptCardViewModel.kt",
    "TopicFragmentPresenter.kt",
    "TopicLessonViewModel.kt",
    "ExpandedChapterListIndexListener.kt",
    "ChapterSummarySelector.kt",
    "TopicLessonsTitleViewModel.kt",
    "StorySummaryViewModel.kt",
    "TopicLessonsFragmentPresenter.kt",
    "TopicLessonsItemViewModel.kt",
    "ChapterSummaryViewModel.kt",
    "StorySummarySelector.kt",
    "RouteToConceptCardListener.kt",
    "StateViewModel.kt",
    "StateFragmentTestViewModel.kt",
    "StateFragmentTestActivity.kt",
    "StateFragmentTestActivityPresenter.kt",
    "ReturnToTopicNavigationButtonListener.kt",
    "ReplayButtonListener.kt",
    "ShowHintAvailabilityListener.kt",
    "StateKeyboardButtonListener.kt",
    "ContinueNavigationButtonListener.kt",
    "PreviousResponsesHeaderClickListener.kt",
    "NextNavigationButtonListener.kt",
    "SubmitNavigationButtonListener.kt",
    "RouteToHintsAndSolutionListener.kt",
    "PreviousNavigationButtonListener.kt",
    "DragDropSortInteractionView.kt",
    "StatePlayerRecyclerViewAssembler.kt",
    "DelayShowAdditionalHintsMillis.kt",
    "DelayShowInitialHintMillis.kt",
    "HintsAndSolutionConfigFastShowTestModule.kt",
    "DelayShowAdditionalHintsFromWrongAnswerMillis.kt",
    "HintsAndSolutionConfigModule.kt",
    "FractionInteractionViewModel.kt",
    "TextInputViewModel.kt",
    "StateItemViewModel.kt",
    "ImageRegionSelectionInteractionViewModel.kt",
    "FeedbackViewModel.kt",
    "InteractionViewModelFactory.kt",
    "DragAndDropSortInteractionViewModel.kt",
    "DragDropInteractionContentViewModel.kt",
    "ContentViewModel.kt",
    "InteractionViewModelModule.kt",
    "SubmittedAnswerViewModel.kt",
    "ContinueNavigationButtonViewModel.kt",
    "ContinueInteractionViewModel.kt",
    "SelectionInteractionContentViewModel.kt",
    "SubmitButtonViewModel.kt",
    "PreviousResponsesHeaderViewModel.kt",
    "ReplayButtonViewModel.kt",
    "SelectionInteractionViewModel.kt",
    "NextButtonViewModel.kt",
    "PreviousButtonViewModel.kt",
    "ReturnToTopicButtonViewModel.kt",
    "NumericInputViewModel.kt",
    "RatioExpressionInputInteractionViewModel.kt",
    "SelectionInteractionView.kt",
    "ConfettiConfig.kt",
    "InteractionAnswerErrorOrAvailabilityCheckReceiver.kt",
    "InteractionAnswerHandler.kt",
    "StateFragmentPresenter.kt",
    "StopExplorationDialogFragment.kt",
    "RestartPlayingSessionListener.kt",
    "StopStatePlayingSessionListener.kt",
    "CellularAudioDialogFragment.kt",
    "LanguageInterface.kt",
    "AudioUiManager.kt",
    "CellularDataInterface.kt",
    "AudioFragmentPresenter.kt",
    "AudioButtonListener.kt",
    "AudioViewModel.kt",
    "LanguageDialogFragment.kt",
    "HintsAndSolutionExplorationManagerFragment.kt",
    "ExplorationManagerFragment.kt",
    "HintsAndSolutionExplorationManagerListener.kt",
    "HintsAndSolutionExplorationManagerFragmentPresenter.kt",
    "ExplorationViewModel.kt",
    "ExplorationFragment.kt",
    "ExplorationManagerFragmentPresenter.kt",
    "DefaultFontSizeStateListener.kt",
    "ExplorationActivityPresenter.kt",
    "ExplorationFragmentPresenter.kt",
    "WalkthroughPages.kt",
    "WalkthroughWelcomeFragmentPresenter.kt",
    "WalkthroughWelcomeViewModel.kt",
    "WalkthroughFragmentChangeListener.kt",
    "WalkthroughViewModel.kt",
    "WalkthroughActivityPresenter.kt",
    "WalkthroughActivityListener.kt",
    "WalkthroughPageChanger.kt",
    "WalkthroughTopicViewModel.kt",
    "WalkthroughTopicSummaryViewModel.kt",
    "WalkthroughTopicHeaderViewModel.kt",
    "WalkthroughTopicListFragmentPresenter.kt",
    "WalkthroughTopicItemViewModel.kt",
    "WalkthroughFinalViewModel.kt",
    "WalkthroughFinalFragmentPresenter.kt",
    "WalkthroughFinalListener.kt",
    "WalkthroughEndPageChanger.kt",
    "ProfileEditDialogInterface.kt",
    "ProfileEditFragment.kt",
    "ProfileEditViewModel.kt",
    "ProfileResetPinActivityPresenter.kt",
    "ProfileEditActivityPresenter.kt",
    "ProfileListFragmentPresenter.kt",
    "ProfileListActivityPresenter.kt",
    "ProfileListViewModel.kt",
    "ProfileEditDeletionDialogFragment.kt",
    "ProfileEditFragmentPresenter.kt",
    "ProfileRenameActivityPresenter.kt",
    "ProfileResetPinViewModel.kt",
    "ProfileRenameViewModel.kt",
    "RecyclerViewMatcher.kt",
    "EspressoTestsMatchers.kt",
    "ProgressMatcher.kt",
    "OrientationChangeAction.kt",
    "FontSizeMatcher.kt",
    "DragViewAction.kt",
    "DrawableMatcher.kt",
    "TabMatcher.kt",
    "ClickActions.kt",
    "Constants.kt",
    "OppiaRetrofit.kt",
    "NetworkSettings.kt",
    "GaeState.kt",
    "GaeExplorationContainer.kt",
    "GaeSolution.kt",
    "GaeUserSuppliedFeedback.kt",
    "GaeStorySummary.kt",
    "GaeStory.kt",
    "GaeStoryNode.kt",
    "GaeWrittenTranslation.kt",
    "GaeExpSummary.kt",
    "GaeSubtitledHtml.kt",
    "GaeInteractionInstance.kt",
    "GaeStateClassifier.kt",
    "GaeFeedbackReportingSystemContext.kt",
    "GaeRuleSpec.kt",
    "GaeQuestionPlayer.kt",
    "GaeRecordedVoiceovers.kt",
    "GaeTopic.kt",
    "GaeConceptCard.kt",
    "GaeQuestion.kt",
    "GaeVoiceover.kt",
    "GaeTopicSummary.kt",
    "GaeParamChange.kt",
    "GaeClassroom.kt",
    "GaeAnswerGroup.kt",
    "GaeFeedbackReport.kt",
    "GaeExploration.kt",
    "GaeSubtopic.kt",
    "GaeParamSpec.kt",
    "GaeSkillContents.kt",
    "GaeSubtopicPageContents.kt",
    "GaeWrittenTranslations.kt",
    "GaeFeedbackReportingAppContext.kt",
    "GaeFeedbackReportingDeviceContext.kt",
    "GaeCustomizationArgs.kt",
    "GaeOutcome.kt",
    "GaeFeedbackReportingEntryPoint.kt",
    "GaeHint.kt",
    "GaeSubtopicSummary.kt",
    "NetworkApiKey.kt",
    "NetworkModule.kt",
    "ExemptionsList.kt",
    "ScriptResultConstants.kt",
    "RepoFile.kt",
    "SyntaxErrorHandler.kt"
  )
}
