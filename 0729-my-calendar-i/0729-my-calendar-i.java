
class MyCalendar {

    ArrayList<int[]> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {

        for (int[] event : list) {

            if (startTime < event[1] && endTime > event[0]) {
                return false;
            }
        }

        list.add(new int[]{startTime, endTime});

        return true;
    }
}
