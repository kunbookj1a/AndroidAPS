package app.aaps.core.keys

enum class IntKey(
    override val key: Int,
    val defaultValue: Int,
    val min: Int,
    val max: Int,
    override val defaultedBySM: Boolean = false,
    val calculatedDefaultValue: Boolean = false,
    override val showInApsMode: Boolean = true,
    override val showInNsClientMode: Boolean = true,
    override val showInPumpControlMode: Boolean = true,
    override val dependency: Int = 0,
    override val negativeDependency: Int = 0,
    override val hideParentScreenIfHidden: Boolean = false,
    val engineeringModeOnly: Boolean = false
) : PreferenceKey {

    OverviewCarbsButtonIncrement1(R.string.key_carbs_button_increment_1, 5, -50, 50, defaultedBySM = true),
    OverviewCarbsButtonIncrement2(R.string.key_carbs_button_increment_2, 10, -50, 50, defaultedBySM = true),
    OverviewCarbsButtonIncrement3(R.string.key_carbs_button_increment_3, 20, -50, 50, defaultedBySM = true),
    OverviewEatingSoonDuration(R.string.key_eating_soon_duration, 45, 15, 120, defaultedBySM = true, hideParentScreenIfHidden = true),
    OverviewActivityDuration(R.string.key_activity_duration, 90, 15, 600, defaultedBySM = true),
    OverviewHypoDuration(R.string.key_hypo_duration, 60, 15, 180, defaultedBySM = true),
    OverviewCageWarning(R.string.key_statuslights_cage_warning, 48, 24, 240, defaultedBySM = true),
    OverviewCageCritical(R.string.key_statuslights_cage_critical, 72, 24, 240, defaultedBySM = true),
    OverviewIageWarning(R.string.key_statuslights_iage_warning, 72, 24, 240, defaultedBySM = true),
    OverviewIageCritical(R.string.key_statuslights_iage_critical, 144, 24, 240, defaultedBySM = true),
    OverviewSageWarning(R.string.key_statuslights_sage_warning, 216, 24, 720, defaultedBySM = true),
    OverviewSageCritical(R.string.key_statuslights_sage_critical, 240, 24, 720, defaultedBySM = true),
    OverviewSbatWarning(R.string.key_statuslights_sbat_warning, 25, 0, 100, defaultedBySM = true),
    OverviewSbatCritical(R.string.key_statuslights_sbat_critical, 5, 0, 100, defaultedBySM = true),
    OverviewBageWarning(R.string.key_statuslights_bage_warning, 216, 24, 1000, defaultedBySM = true),
    OverviewBageCritical(R.string.key_statuslights_bage_critical, 240, 24, 1000, defaultedBySM = true),
    OverviewResWarning(R.string.key_statuslights_res_warning, 80, 0, 300, defaultedBySM = true),
    OverviewResCritical(R.string.key_statuslights_res_critical, 10, 0, 300, defaultedBySM = true),
    OverviewBattWarning(R.string.key_statuslights_bat_warning, 51, 0, 100, defaultedBySM = true),
    OverviewBattCritical(R.string.key_statuslights_bat_critical, 26, 0, 100, defaultedBySM = true),
    OverviewBolusPercentage(R.string.key_boluswizard_percentage, 100, 10, 100),
    OverviewResetBolusPercentageTime(R.string.key_reset_boluswizard_percentage_time, 16, 6, 120, defaultedBySM = true, engineeringModeOnly = true),
    GeneralProtectionTimeout(R.string.key_protection_timeout, 1, 1, 180, defaultedBySM = true),
    SafetyMaxCarbs(R.string.key_safety_max_carbs, 48, 1, 200),
    LoopOpenModeMinChange(R.string.key_loop_open_mode_min_change, 30, 0, 50, defaultedBySM = true),
    ApsMaxSmbFrequency(R.string.key_openaps_smb_interval, 3, 1, 10, defaultedBySM = true),
    ApsMaxMinutesOfBasalToLimitSmb(R.string.key_openaps_smb_max_minutes, 30, 15, 120, defaultedBySM = true),
    ApsUamMaxMinutesOfBasalToLimitSmb(R.string.key_openaps_uam_smb_max_minutes, 30, 15, 120, defaultedBySM = true),
    ApsCarbsRequestThreshold(R.string.key_openaps_carbs_required_threshold, 1, 1, 10, defaultedBySM = true),
    ApsDynIsfAdjustmentFactor(R.string.key_dynamic_isf_adjustment_factor, 100, 1, 300, dependency = R.string.key_use_dynamic_sensitivity),
    AutosensPeriod(R.string.key_openapsama_autosens_period, 24, 4, 24, calculatedDefaultValue = true),
    MaintenanceLogsAmount(R.string.key_maintenance_logs_amount, 2, 1, 10, defaultedBySM = true),
    AlertsStaleDataThreshold(R.string.key_missed_bg_readings_threshold_minutes, 30, 15, 10000, defaultedBySM = true),
    AlertsPumpUnreachableThreshold(R.string.key_pump_unreachable_threshold_minutes, 30, 30, 300, defaultedBySM = true),
}