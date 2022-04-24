package com.narayan.hmsc.AdminPatternMatcher;

public class AddReceptionistPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==4);
    }

    @Override
    public void response() {
        admin.addReceptionist();
    }
}
