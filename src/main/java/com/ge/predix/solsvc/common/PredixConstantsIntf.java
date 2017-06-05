package com.ge.predix.solsvc.common;

/**
 * Created by made_sudarsana on 6/5/2017.
 */
public interface PredixConstantsIntf {
    public class TimeSeriesQuality {
        private TimeSeriesQuality() {
        }

        public static final Integer BAD_QUALITY           = 0;
        public static final Integer UNCERTAIN_QUALITY     = 1;
        public static final Integer NOT_APLICABLE_QUALITY = 2;
        public static final Integer GOOD_QUALITY          = 3;
    }
}
