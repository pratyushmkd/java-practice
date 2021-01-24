import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

class Main {
  public static void main(String[] args) {

    List<Integer> usrList = Arrays.asList(4, 4, 4, 4, 4);
    List<Integer> perRoleList = Arrays.asList(1, 4, 4, 4, 4);
    List<Integer> unSyncList = new ArrayList<>(usrList);
    unSyncList.removeAll(perRoleList);

    System.out.println("unSyncList:---" + unSyncList);

  }
}