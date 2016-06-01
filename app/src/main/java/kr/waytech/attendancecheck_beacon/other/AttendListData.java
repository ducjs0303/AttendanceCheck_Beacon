package kr.waytech.attendancecheck_beacon.other;

import java.util.Calendar;

/**
 * Created by Kim-Jinoh on 16. 6. 02..
 * 출석 리스트 데이터
 */
public class AttendListData {
    private String id;
    private String name;
    private int image;

    private Calendar calIn;
    private Calendar calOut;


    public AttendListData(String id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
        calIn = null;
        calOut= null;
    }



    public Calendar getCalIn() {
        return calIn;
    }

    public void setCalIn(Calendar calIn) {
        this.calIn = calIn;
    }

    public Calendar getCalOut() {
        return calOut;
    }

    public void setCalOut(Calendar calOut) {
        this.calOut = calOut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
