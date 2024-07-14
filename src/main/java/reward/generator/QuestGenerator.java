package reward.generator;

public class QuestGenerator {

    public static String generateQuestRewards(int N) {
        StringBuilder rewards = new StringBuilder(N);

        for (int i = 0; i < N; i++) {
            double normalizedIndex = (double) i / (N - 1);

            double probabilityOfS = Math.sin(normalizedIndex * Math.PI / 2);

            int numberOfSNeeded = (int) Math.round(probabilityOfS * (i + 1));
            int currentNumberOfS = (int) rewards.chars().filter(ch -> ch == 's').count();

            if (currentNumberOfS < numberOfSNeeded) {
                rewards.append('s');
            } else {
                rewards.append('b');
            }
        }

        return rewards.toString();
    }
}