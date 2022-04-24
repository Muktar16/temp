package com.narayan.hmsc.PatternMatchers;

import com.narayan.hmsc.main.HMSApp;



public interface MenuPatternMatcher {
    HMSApp hmsapp = new HMSApp();
    public boolean matched(int choice);
    public void response();
}
