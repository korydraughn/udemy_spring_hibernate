package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout()
	{
		return "Do a shooting drill for 5 minutes";
	}

    @Override
    public String getDailyFortune()
    {
        return null;
    }

}
