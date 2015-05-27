package com.vibrato.sngdomination;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

enum GameType {
    JACKPOT, SIX_MAX, NINE_MAX, MTT
}

public class QuizActivity extends ActionBarActivity {
    private PlayerHand playerHand;
    private ShuffledDeck currentDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        generateHand();
        renderHand();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void generateHand() {
        this.currentDeck = new ShuffledDeck();

        this.playerHand = new PlayerHand(this.currentDeck.dealOne(), this.currentDeck.dealOne());
        Log.i(this.getClass().getName(), "dealt hand to player: " + playerHand );
        Log.i(this.getClass().getName(), "remaining cards: " + this.currentDeck.getRemainingCards() );
    }

    public void renderHand() {
        ImageView card1Image = (ImageView) findViewById(R.id.btn_card1);
        ImageView card2Image = (ImageView) findViewById(R.id.btn_card2);

        Card card1 = this.playerHand.getCard1();
        Card card2 = this.playerHand.getCard2();

        setImageForCard(card1, card1Image);
        setImageForCard(card2, card2Image);
    }

    public void setImageForCard (Card card, ImageView imageView) {
        String imageName = card.getSuit().toString().toLowerCase().substring(0, 1);

        switch (card.getRank()){
            case DEUCE: imageName += "2"; break;
            case THREE: imageName += "3"; break;
            case FOUR: imageName += "4"; break;
            case FIVE: imageName += "5"; break;
            case SIX: imageName += "6"; break;
            case SEVEN: imageName += "7"; break;
            case EIGHT: imageName += "8"; break;
            case NINE: imageName += "8"; break;
            default: imageName += card.getRank().toString().toLowerCase().substring(0, 1); break;
        }

        imageView.setImageResource(getResources().getIdentifier(imageName, "drawable", getPackageName()));
    }
}
