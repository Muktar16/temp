package com.narayan.hmsc.AdminPatternMatcher;

public class ListReceptionistPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==6);
    }

    @Override
    public void response() {
        admin.listReceptionist();
    }
}
