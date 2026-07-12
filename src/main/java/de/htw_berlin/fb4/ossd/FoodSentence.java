package de.htw_berlin.fb4.ossd;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class FoodSentence implements Sentence {

    @Override
    public String get() {
        return "I opened the fridge and hoped for inspiration";
    }
}
