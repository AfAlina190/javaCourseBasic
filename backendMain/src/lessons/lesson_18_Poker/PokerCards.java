package lessons.lesson_18_Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PokerCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков:");
        int numPlayers = scanner.nextInt();
        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }
        List<Card> deck = createDeck();
        Collections.shuffle(deck);
        for (int i = 0; i < 5 * numPlayers; i++) {
            int index = i % numPlayers;
            players.get(index).add(deck.remove(deck.size() - 1));
        }
        String[] cardSuit = {"♠️","♣️","♦️","♥️"};
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (Card card : players.get(i)) {
                String rank = getRankString(card.getRank());
                System.out.println(rank + cardSuit[card.getSuit()]);
            }
            System.out.println();
        }
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 2; rank <= 14; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    private static String getRankString(int rank) {
        if (rank >= 2 && rank <= 9) {
            return String.valueOf(rank);
        } else {
            switch (rank) {
                case 10:
                    return "10";
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
                case 14:
                    return "A";
                default:
                    return "";
            }
        }
    }
}

class Card {

    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "";
    }
}