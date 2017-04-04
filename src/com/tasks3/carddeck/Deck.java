package com.tasks3.carddeck;

/**
 * Created by admin on 04.04.2017.
 */
public class Deck {
    private int numberCard = 36;
    private Card[] card = new Card[numberCard];

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        for (int i=0;i<numberCard;i++)
            {
                card[i]=new Card(Rank.values[i/4],Suit.values[i/4]);
            }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return true;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (numberCard == 0){
            return null;
        }
        else {
            numberCard--;
            return card[numberCard];
        }
    }

    public static void main(String[] args) {
        //for (int i=1;i<=n)
        //System.out.println(Suit.CLUBS.getName());
    }

}
