package com.narayan.hmsc.AdminPatternMatcher;

public class DeleteReceptionistPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (choice==5);
    }

    @Override
    public void response() {
        admin.deleteReceptionist();
    }
}
