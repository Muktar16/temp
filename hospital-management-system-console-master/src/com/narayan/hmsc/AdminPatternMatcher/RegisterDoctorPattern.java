package com.narayan.hmsc.AdminPatternMatcher;

public class RegisterDoctorPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==1);
    }

    @Override
    public void response() {
        admin.registerDoctor();
    }
}
