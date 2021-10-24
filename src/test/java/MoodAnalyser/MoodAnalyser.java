package MoodAnalyser;

    /**
     * Purpose  - Mood Analyser for user
     * @author  - Ajay Jadhav
     * @version - 16.0
     * @since   - 2021-10-20
     */

    public class MoodAnalyser {

        public static String analyseMood(String mood) {
            if (mood.toLowerCase().contains("happy")) {
                return "Entry Successful";
            } else if (mood.toLowerCase().contains("sad")) {
                return "Entry Failed";
            } else return null;
        }
    }

