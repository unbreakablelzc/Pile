package com.polytechtours.di5.Pile.view;

import java.util.Observable;
import java.util.Observer;

import com.polytechtours.di5.Pile.model.StubPile;

public class StubViewBottomPile implements Observer{
	
	public int countUpdate = 0;

	public void update(Observable o, Object arg) {
		StubPile pile = (StubPile)o;
		if(pile.size >= 0 && pile.size <= 5) {
			countUpdate ++;
		}
	}

}
