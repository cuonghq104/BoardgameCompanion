package hq.cuong.boardgamecompanion.models;

import java.util.ArrayList;

/**
 * Created by Cuong on 1/1/2017.
 */
public class TutorialBlock {

    public static final String TEXT_TYPE = "text";
    public static final String IMAGE_TYPE = "image";

    private String type;

    private String text;

    private String imageUrl;

    private String textType;

    public static final String TITLE = "title";
    public static final String INNER_TITLE = "inner";
    public static final String CONTENT = "content";

    public TutorialBlock(String type, String text, String textType, String imageUrl) {
        this.type = type;
        this.text = text;
        this.textType = textType;
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public String getTextType() {
        return textType;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

//    public static ArrayList<TutorialBlock> list  = new ArrayList<>();

//    public static final TutorialBlock[] TUTORIAL_BLOCKS = {
//            new TutorialBlock(TEXT_TYPE, "Bạn là một trong trùm “xã hội đen” khét tiếng của một quốc gia....Một nhà nước được điều hành bởi một tòa án yếu kém và đầy rẫy những tham nhũng. Điều bạn cần làm là tiêu diệt sự ảnh hưởng của tất cả các băng nhóm khác... và... Chỉ duy nhất một tổ chức sẽ sống sót……", CONTENT, null),
//            new TutorialBlock(IMAGE_TYPE, null, null, "http://hstatic.net/936/1000019936/10/2016/3-14/81snawxvitl._sl1500__grande.jpg"),
//            new TutorialBlock(TEXT_TYPE, "Thành phần", TITLE, null),
//            new TutorialBlock(TEXT_TYPE, "1 -  Thẻ nhân vật x15:\n" +
//                    "\n" +
//                    "2 -  Thẻ tóm lược x6 \n" +
//                    "\n" +
//                    "3 -  Tiền xu", CONTENT,
//                    null),
//            new TutorialBlock(IMAGE_TYPE, null, null, "http://hstatic.net/936/1000019936/10/2016/3-14/pic1759100_grande.jpg")
//    };

    public static TutorialBlock createContentTextBlock(String text) {
        return new TutorialBlock(TEXT_TYPE, text, CONTENT, null);
    }

    public static TutorialBlock createTitleTextBlock(String text) {
        return new TutorialBlock(TEXT_TYPE, text, TITLE, null);
    }

    public static TutorialBlock createInnerTitleTextBlock(String text) {
        return new TutorialBlock(TEXT_TYPE, text, INNER_TITLE, null);
    }

    public static TutorialBlock createImageBlock(String imageUrl) {
        return new TutorialBlock(IMAGE_TYPE, null, null, imageUrl);
    }

    @Override
    public String toString() {
        return "TutorialBlock{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
