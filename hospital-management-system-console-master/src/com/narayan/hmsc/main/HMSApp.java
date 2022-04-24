package com.narayan.hmsc.main;

import static com.narayan.hmsc.util.CommonUtils.learnOptionFromUser;
import static com.narayan.hmsc.util.CommonUtils.showApplicationEntryOptions;
import static com.narayan.hmsc.util.CommonUtils.showBanner;

import com.narayan.hmsc.PatternMatchers.ExitPatternMatcher;
import com.narayan.hmsc.PatternMatchers.MenuPatternMatcher;
import com.narayan.hmsc.PatternMatchers.StartAdminModePatternMatcher;
import com.narayan.hmsc.mode.AdminMode;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author unmattavesa
 *
 */
public class HMSApp {

	public static void main(String[] args) {
		showBanner();

		HMSApp hmsApp = new HMSApp();
		hmsApp.manage();
				
	}

	private void manage() {
		showApplicationEntryOptions();
		int mode = learnOptionFromUser();


		/*switch(mode) {
			case 1  : startAdminMode(); break;
			case 2  : System.out.println("2"); break;
			case 3  : System.out.println("3"); break;
			case 4  : System.out.println("4"); break;
			default : System.out.println("default"); break;
		}*/
		List<MenuPatternMatcher> patternMatchers = Arrays.asList(new StartAdminModePatternMatcher(), new ExitPatternMatcher());

		//switch statement replaced with patternMatcher
		for(MenuPatternMatcher patternMatcher: patternMatchers){
			if(patternMatcher.matched(mode)){
				patternMatcher.response();
			}
		}
	}

	public void startAdminMode() {
		AdminMode adminMode = new AdminMode();
		adminMode.operate();
	}

	
}
