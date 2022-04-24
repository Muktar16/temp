package com.narayan.hmsc.AdminPatternMatcher;

public class ListRegisteredDoctorPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==3);
    }

    @Override
    public void response() {
        admin.listRegisteredDoctors();
    }
}
