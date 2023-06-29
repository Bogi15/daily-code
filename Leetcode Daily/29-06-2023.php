//leetcode 1360
class Solution {
    function daysBetweenDates($date1, $date2) {
        $date1 = strtotime($date1);
        $date2 = strtotime($date2);
        return floor(abs($date1-$date2)/86400);
    }
}
