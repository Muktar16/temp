package com.narayan.hmsc.AdminPatternMatcher;

import com.narayan.hmsc.main.HMSApp;
import com.narayan.hmsc.mode.AdminMode;

public interface AdminPatternMatcher {
    AdminMode admin = new AdminMode();
    public boolean matched(int choice);
    public void response();
}
