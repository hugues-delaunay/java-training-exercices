package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck {

	private static final long serialVersionUID = -4686285366508321800L;

	public Deck() {
	}

	@Override
	public Card pick() {
		Collections.shuffle(this);
		return this.removeFirst();
	}

	@Override
	public TreeSet<Card> pick(int number) {
		TreeSet<Card> t = new TreeSet<>();
		for(int i =0; i<number; i++){
	
			t.add(pick());
			}
		return t;
	}

	@Override
	public Hand giveHand() {
		
		Hand hand = new Hand();
		hand.addAll(pick(5));

		return hand;
	}

}
