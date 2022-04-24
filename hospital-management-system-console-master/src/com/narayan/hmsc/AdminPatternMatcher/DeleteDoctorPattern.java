package com.narayan.hmsc.AdminPatternMatcher;

public class DeleteDoctorPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==2);
    }

    @Override
    public void response() {
        admin.deleteDoctor();
    }
}
