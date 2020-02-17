package com.epamtask_week4.House;
class House_Cost
{
	float find_cost(int ch,float area)
	{
		if (ch==4)
			return 2500*area;
		else
			return 300*(ch+3)*area;
	}
}
