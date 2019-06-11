package larisasviridova;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
   public String getFormattedDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }
}
