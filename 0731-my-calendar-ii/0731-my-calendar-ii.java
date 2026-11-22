class MyCalendarTwo {
    ArrayList<int[]> bookings;
    ArrayList<int[]> overlaps;
    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    public boolean book(int startTime, int endTime) {
        for (int[] event : overlaps) {
            if (startTime < event[1] && endTime > event[0]) {
                return false;
            }
        }
        for (int[] event : bookings) {
            if (startTime < event[1] && endTime > event[0]) {
                int start = Math.max(startTime, event[0]);
                int end = Math.min(endTime, event[1]);
                overlaps.add(new int[]{start, end});
            }
        }
        bookings.add(new int[]{startTime, endTime});
        return true;
    }
}
