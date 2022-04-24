package com.narayan.hmsc.AdminPatternMatcher;

public class DefaultPattern implements AdminPatternMatcher{
    @Override
    public boolean matched(int choice) {
        return (!(choice>=1 && choice<=7));
    }

    @Override
    public void response() {
        System.out.println("\nPlease Choose a valid option : ");
        admin.operate();
    }
}
