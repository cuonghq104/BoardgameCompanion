package hq.cuong.boardgamecompanion.models;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Cuong on 1/1/2017.
 */
public class TutorialBlock {

    public static final String TEXT_TYPE = "text";
    public static final String IMAGE_TYPE = "image";
    public static final String COMBINE_TYPE = "combine";

    private String type;

    private String title;

    private String content;

    private String imageUrl;

    private String[] tags;

    public TutorialBlock(String type, String title, String content, String imageUrl, String[] tags) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.tags = tags;
//        this.tags = Arrays.asList(tags);
//        this.tags = new String[] {"*"};
//        for (String tag : tags) {
//            this.tags[this.tags.length] = new String();
//            this.tags[this.tags.length] = tag;
//        }
    }

    public static TutorialBlock createText(String title, String content, String[] tags) {
        return new TutorialBlock(TEXT_TYPE, title, content, null, tags);
    }

    public static TutorialBlock createImage(String imageUrl, String[] tags) {
        return new TutorialBlock(IMAGE_TYPE, null, null, imageUrl, tags);
    }

    public static TutorialBlock createCombine(String title, String content, String imageUrl, String[] tags) {
        return new TutorialBlock(COMBINE_TYPE, title, content, imageUrl, tags);
    }

    public String[] getTags() {
        return tags;
    }

    //    public static final TutorialBlock[] TUTORIAL_BLOCKS = {
//            TutorialBlock.createText("Trình tự game", "1. Giai đoạn ban đêm: Mọi người nhắm mắt, Quản Trò gọi vai trò đặc biệt nào thì vai trò ấy mở mắt và thực hiện chức năng của mình trong-yên-lặng. Trình tự gọi của Quản Trò như sau: Ăn trộm (Chỉ đêm đầu tiên)->Cupid (Chỉ đêm đầu tiên)->2 người yêu nhau (Chỉ đêm đầu tiên)->Bảo vệ->Sói->Tiên Tri->Phù Thủy->Thổi sáo->Những người bị thôi miên->Già Làng (Chỉ đêm đầu tiên)->Thợ Săn (Chỉ đêm đầu tiên)\n" +
//                    "2. Ban ngày: Quản trò ra hiệu mọi người mở mắt, thông báo những ai đã chết đêm qua. Sau đó, dân làng bình bầu treo cổ một người bị nghi ngờ là Ma Sói trong ban ngày (Có thể hoãn không treo). Nếu có 2 người cùng có số phiếu bầu treo như nhau thì không ai bị treo cả."),
//            TutorialBlock.createCombine("Tiên tri", "Mỗi đêm, khi được gọi dậy Tiên Tri sẽ chỉ một người. Nếu người đó là Sói Quản trò sẽ gật đầu.\n" , "http://2.bp.blogspot.com/_0Pz0L1XQR1k/TB-cjdrXS2I/AAAAAAAAAUw/PHjf91XHa9U/s320/fortune+teller.png"),
////            TutorialBlock.createImage(""),
//            TutorialBlock.createCombine("Thợ săn", "Khi thợ săn chết, dù là dưới bất kỳ hình thức nào cũng có thể chọn một người chơi khác và kéo hắn xuống “Tuyền đường” cùng Thợ Săn", "http://1.bp.blogspot.com/-n_Ol3Hw7OTY/VGxC-hcsFYI/AAAAAAAABXI/bU3urwBQKK8/s1600/hunter.png"),
////            TutorialBlock.createImage(""),
//            TutorialBlock.createCombine("Phù thủy", "Phù Thủy có hai bình thuốc: Một bình dùng để cứu một người, còn một bình dùng để giết một người. Mỗi đêm, Quản trò khi gọi Phù Thủy dậy sẽ cho Phù Thủy biết người bị giết bởi Sói đêm đó, và Phù Thủy được quyền quyết định xem có cứu người ấy hay không. Sau đó, quản trò sẽ hỏi xem Phù Thủy có dùng bình giết giết ai hay không. Một khi đã dùng bình thì Phù Thủy sẽ mất đi chức năng tương ứng, tuy nhiên vẫn được gọi dậy mỗi đêm và biết ai chết. Lưu ý: Nếu đêm đó Bảo Vệ đã Bảo Vệ đúng người thì Quản trò sẽ lắc tay, ra dấu là không ai chết cả.", "http://2.bp.blogspot.com/_0Pz0L1XQR1k/TB-d0OJIX_I/AAAAAAAAAU4/JNek6CgDWPM/s320/witch.png"),
////            TutorialBlock.createImage(""),
//            TutorialBlock.createCombine("Cupid", "Đầu mỗi ván chơi, Cupid sẽ được gọi dậy và chọn ra hai người yêu nhau. Cupid sau đó nhắm mắt lại và hai người yêu nhau sẽ được Quản Trò gọi dậy để biết mặt và Vai Trò của nhau. Nếu hai người thuộc hai phe khác nhau (Sói vs Dân) thì họ thành phe thứ ba với nhiệm vụ là hai người cuối cùng sống sót.", "http://4.bp.blogspot.com/_hqAyb8K3zT8/SJxPWu9T55I/AAAAAAAAA7c/lnxMUs99j-g/s320/cupid.jpg")
//
//    };
//
//    public static List<TutorialBlock> list = new ArrayList<>();

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "TutorialBlock{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
