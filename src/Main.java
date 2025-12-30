import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContentItem> contentList = new ArrayList<>();

        contentList.add(new VideoLecture("Java OOP", 2024, 90, "HD"));
        contentList.add(new PodcastEpisode("Tech Talk", 2023, 45, "Alice"));

        int currentYear = 2025;

        for (ContentItem item : contentList) {
            System.out.println(item);
            System.out.println("License Cost: $" + item.getLicenseCost(currentYear));
            System.out.println();
        }
    }
}