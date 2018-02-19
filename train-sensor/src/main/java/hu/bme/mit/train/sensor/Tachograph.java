package hu.bme.mit.train.sensor;

import java.util.Date;

/**
 * Created by meres on 2/19/18.
 */
public class Tachograph {
    private Table<Date, Integer, Integer> val;

    public Tachograph() {
        val = HashBasedTable.create();
    }

    public void recordValues(Date d, Integer joysticPosition, Integer referenceSpeed) {
        val.put(d, joysticPosition, referenceSpeed);
    }

    public int getNumberOfElements() {
        return val.size();
    }
}
