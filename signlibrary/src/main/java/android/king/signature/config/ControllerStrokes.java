package android.king.signature.config;


import java.util.ArrayList;
import java.util.List;

/***
 * 笔画，由ControllerPoint组成
 *
 * @since 2018/06/15
 * @author king
 */
public class ControllerStrokes extends ArrayList<List<ControllerPoint>> {
    public ControllerStrokes() {

    }

    public void clear() {
        for (List<ControllerPoint> pts : this) {
            pts.clear();
        }
        this.clear();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (List<ControllerPoint> pts : this) {
            stringBuffer.append('[');
            for (ControllerPoint pt : pts) {
                stringBuffer.append(pt.toString());
            }
            stringBuffer.append(']');
        }
        return stringBuffer.append(']').toString();
    }
}
