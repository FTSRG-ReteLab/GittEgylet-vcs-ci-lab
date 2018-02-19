package hu.bme.mit.train.sensor;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.Date;

/**
 * Created by meres on 2/19/18.
 */
public class Tachograph {
    private Table<Date, Integer, Integer> values;

    public Tachograph() {
        values = HashBasedTable.create();
    }

    public void recordValues(Date d, Integer joysticPosition, Integer referenceSpeed) {
        values.put(d, joysticPosition, referenceSpeed);
    }

    public int getNumberOfElements() {
        return values.size();
    }
}
