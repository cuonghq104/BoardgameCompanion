package hq.cuong.boardgamecompanion.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cuong on 1/1/2017.
 */
public class BoardGame {

    public static int currentBoardGame;

    public static String BOARD_GAME = "boardgame";

    private String name;

    private String imageUrl;

    private String detailUrl;

    private String rulesUrl;

    private String thumbUrl;

    private int minPlayer;

    private int maxPlayer;

    private String favoritePlayer;

    private int playingTime;

    private String[] categories;

    private String[] playType;

    private TutorialBlock[] tutorialBlocks;

    public BoardGame(String name, String imageUrl, String detailUrl, String rulesUrl, String thumbUrl, int minPlayer, int maxPlayer, String favoritePlayer, int playingTime, String[] categories, String[] playType, TutorialBlock[] tutorialBlocks) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.detailUrl = detailUrl;
        this.rulesUrl = rulesUrl;
        this.thumbUrl = thumbUrl;
        this.minPlayer = minPlayer;
        this.maxPlayer = maxPlayer;
        this.favoritePlayer = favoritePlayer;
        this.playingTime = playingTime;
        this.categories = categories;
        this.tutorialBlocks = tutorialBlocks;
        this.playType = playType;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public int getMinPlayer() {
        return minPlayer;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public String getFavoritePlayer() {
        return favoritePlayer;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

//    "https://cf.geekdo-images.com/images/pic2016054_md.jpg",
//            "https://view.publitas.com/p222-11815/coup/page/1",
    public static BoardGame[] boardGames = {
            new BoardGame("Werewolf basic",
                    "http://www.spielbude.ch/platform/apps/shop/images/obj-100839-4904-original.jpg",
                    "https://view.publitas.com/31715/238002/pdfs/29e027e72495889a166168ef7381e724e457f61b.pdf",
                    "https://view.publitas.com/31715/238026/pdfs/9a62cfa203a163ccae30cc9a02ca872e2321c5d6.pdf",
                    "http://boardgame.vn/uploads/u/boardgame.vn/product/2015/05/09/10/44/1431161080_935.jpg",
                    8, 18,
                    "11-15",
                    30,
                    new String[] {"buffing", "deduction", "horror", "murder", "mystery", "party"},
                    new String[] {"partnership", "player elimination", "role playing", "voting"},
                    new TutorialBlock[]  {
                            TutorialBlock.createText("Trình tự game", "1. Giai đoạn ban đêm: Mọi người nhắm mắt, Quản Trò gọi vai trò đặc biệt nào thì vai trò ấy mở mắt và thực hiện chức năng của mình trong-yên-lặng. Trình tự gọi của Quản Trò như sau: Ăn trộm (Chỉ đêm đầu tiên)->Cupid (Chỉ đêm đầu tiên)->2 người yêu nhau (Chỉ đêm đầu tiên)->Bảo vệ->Sói->Tiên Tri->Phù Thủy->Thổi sáo->Những người bị thôi miên->Già Làng (Chỉ đêm đầu tiên)->Thợ Săn (Chỉ đêm đầu tiên)\n" +
                                    "2. Ban ngày: Quản trò ra hiệu mọi người mở mắt, thông báo những ai đã chết đêm qua. Sau đó, dân làng bình bầu treo cổ một người bị nghi ngờ là Ma Sói trong ban ngày (Có thể hoãn không treo). Nếu có 2 người cùng có số phiếu bầu treo như nhau thì không ai bị treo cả.",
                                    new String[] {"ban ngày", "ban đêm"}),
                            TutorialBlock.createCombine("Tiên tri", "Mỗi đêm, khi được gọi dậy Tiên Tri sẽ chỉ một người. Nếu người đó là Sói Quản trò sẽ gật đầu.\n" , "http://2.bp.blogspot.com/_0Pz0L1XQR1k/TB-cjdrXS2I/AAAAAAAAAUw/PHjf91XHa9U/s320/fortune+teller.png",
                                    new String[] {"sói", "mỗi đêm"}),
                            TutorialBlock.createCombine("Thợ săn", "Khi thợ săn chết, dù là dưới bất kỳ hình thức nào cũng có thể chọn một người chơi khác và kéo hắn xuống “Tuyền đường” cùng Thợ Săn", "http://1.bp.blogspot.com/-n_Ol3Hw7OTY/VGxC-hcsFYI/AAAAAAAABXI/bU3urwBQKK8/s1600/hunter.png",
                                    new String[] {"chết", "mỗi đêm"}),
                            TutorialBlock.createCombine("Phù thủy", "Phù Thủy có hai bình thuốc: Một bình dùng để cứu một người, còn một bình dùng để giết một người. Mỗi đêm, Quản trò khi gọi Phù Thủy dậy sẽ cho Phù Thủy biết người bị giết bởi Sói đêm đó, và Phù Thủy được quyền quyết định xem có cứu người ấy hay không. Sau đó, quản trò sẽ hỏi xem Phù Thủy có dùng bình giết giết ai hay không. Một khi đã dùng bình thì Phù Thủy sẽ mất đi chức năng tương ứng, tuy nhiên vẫn được gọi dậy mỗi đêm và biết ai chết. Lưu ý: Nếu đêm đó Bảo Vệ đã Bảo Vệ đúng người thì Quản trò sẽ lắc tay, ra dấu là không ai chết cả.", "http://2.bp.blogspot.com/_0Pz0L1XQR1k/TB-d0OJIX_I/AAAAAAAAAU4/JNek6CgDWPM/s320/witch.png",
                                    new String[] {"*"}),
                            TutorialBlock.createCombine("Cupid", "Đầu mỗi ván chơi, Cupid sẽ được gọi dậy và chọn ra hai người yêu nhau. Cupid sau đó nhắm mắt lại và hai người yêu nhau sẽ được Quản Trò gọi dậy để biết mặt và Vai Trò của nhau. Nếu hai người thuộc hai phe khác nhau (Sói vs Dân) thì họ thành phe thứ ba với nhiệm vụ là hai người cuối cùng sống sót.", "http://4.bp.blogspot.com/_hqAyb8K3zT8/SJxPWu9T55I/AAAAAAAAA7c/lnxMUs99j-g/s320/cupid.jpg",
                                    new String[] {"đêm đầu tiên"}),
                            TutorialBlock.createCombine("Sói", "Mỗi đêm thức dậy, các Sói sẽ biết mặt lẫn nhau và sẽ cùng thống nhất giết một người. Sói có quyền không giết, và cũng có quyền tự giết lẫn nhau.", "http://i245.photobucket.com/albums/gg61/reakjean/Linh%20Tinh/WereWolf.jpg",
                                    new String[] {"mỗi đêm"})
                    }),
            new BoardGame("uno",
                    "http://boardgame.vn/uploads/u/boardgame.vn/product/2016/08/23/23/31/boa1471948306.JPG",
                    "https://view.publitas.com/31715/238002/pdfs/29e027e72495889a166168ef7381e724e457f61b.pdf",
                    "https://view.publitas.com/31715/238026/pdfs/9a62cfa203a163ccae30cc9a02ca872e2321c5d6.pdf",
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcToOshQ9dUlUDJcb6STup2h4bPsh3xJBAt5-AibCSHrv1f0Gyne",
                    2, 10,
                    "4-6",
                    30,
                    new String[] {"popular", "family", "children", "tactical"},
                    new String[] {"hand management"},
                    null),
            new BoardGame("coup",
                    "http://www.pubmeeple.com/wp-content/uploads/Coup3.jpg",
                    "https://view.publitas.com/31715/237992/pdfs/c27b7e30e500a8b9f1b7259db53f6eb5b974e76a.pdf",
                    "https://view.publitas.com/31715/238019/pdfs/7249eafcc8b80beac36891431e3282f6803d9a0b.pdf",
                    "https://images-na.ssl-images-amazon.com/images/I/81sNAwxviTL._SL1500_.jpg",
                    2, 6,
                    "5",
                    15,
                    new String[] {"Bluffing", "Card", "Deduction"},
                    new String[] {"Memory", "Player Elimination", "Take that"},
                    null),

            new BoardGame("Shadow Hunters", "http://cf.geekdo-images.com/images/pic1215982.jpg", "",
                    "http://cf.geekdo-images.com/images/pic1215982_t.jpg",
                    "http://boardgame.vn/uploads/u/boardgame.vn/product/2015/10/23/05/49/cov1445532563.jpg",
                    4, 8,
                    "7-8",
                    45,
                    new String[] {"Adventure", "Buffing", "Card", "Deduction", "Horror", "Party Game"},
                    new String[] {"Dice Rolling", "Partnership", "Player Elimination"},
                    null),
            new BoardGame("Exploding Kittens", "", "", "", "http://is1.mzstatic.com/image/thumb/Purple20/v4/88/68/ca/8868cac2-e6f3-2239-43a5-3de6e4b637a2/source/512x512bb.jpg",
                    2, 5,
                    "4-5",
                    20,
                    new String[] {"Card Game", "Humour", "Animal",},
                    new String[] {"Hand Management"},
                    null
                    )
    };

    public List<TutorialBlock> list = new ArrayList<>();

    public static List<BoardGame> boardGamesTemps = new ArrayList<>();

    public TutorialBlock[] getTutorialBlocks() {
        return tutorialBlocks;
    }

    public String getRulesUrl() {
        return rulesUrl;
    }

    public String[] getPlayType() {
        return playType;
    }

    //    TutorialBlock[] tutorialBlocks;
//
//    public BoardGame(String name, String imageUrl, TutorialBlock[] tutorialBlocks) {
//        this.name = name;
//        this.imageUrl = imageUrl;
//        this.tutorialBlocks = tutorialBlocks;
//    }
//
//    public TutorialBlock[] getTutorialBlocks() {
//        return tutorialBlocks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public static BoardGame[] boardGames = {
//            new BoardGame("COUP", "//cf.geekdo-images.com/images/pic2016054.jpg", new TutorialBlock[] {
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Bạn là một trong trùm “xã hội đen” khét tiếng của một quốc gia....Một nhà nước được điều hành bởi một tòa án yếu kém và đầy rẫy những tham nhũng. Điều bạn cần làm là tiêu diệt sự ảnh hưởng của tất cả các băng nhóm khác... và... Chỉ duy nhất một tổ chức sẽ sống sót……", TutorialBlock.CONTENT, null),
//                    new TutorialBlock(TutorialBlock.IMAGE_TYPE, null, null, "http://hstatic.net/936/1000019936/10/2016/3-14/81snawxvitl._sl1500__grande.jpg"),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Thành phần", TutorialBlock.TITLE, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "1 -  Thẻ nhân vật x15:\n" +
//                            "\n" +
//                            "2 -  Thẻ tóm lược x6 \n" +
//                            "\n" +
//                            "3 -  Tiền xu", TutorialBlock.CONTENT,
//                            null),
//                    new TutorialBlock(TutorialBlock.IMAGE_TYPE, null, null, "http://hstatic.net/936/1000019936/10/2016/3-14/pic1759100_grande.jpg"),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Chuẩn bị", TutorialBlock.TITLE, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "1 - Đặt tất cả tiền vào giữa bàn chơi ( Ngân hàng )\n" +
//                            "\n" +
//                            "2 - Mỗi người lấy về cho mình 2 xu.\n" +
//                            "\n" +
//                            "3 - Chia đều mỗi người 2 lá nhân vật - người chơi xem và giữ bí mật đặt úp 2 lá trước mặt của mình.\n" +
//                            "\n" +
//                            "[ Điều này cũng có nghĩa là mỗi người chơi sẽ có 2 máu - ai hết 2 máu sẽ bị loại khỏi trò chơi. ]\n" +
//                            "\n" +
//                            "4 - Các Thẻ nhân vật còn lại để vào giữa bàn chơi ( gọi là Deck )", TutorialBlock.CONTENT, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Mục tiêu",  TutorialBlock.INNER_TITLE, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Người sống sót cuối cùng sẽ là người chiến thắng.\",",  TutorialBlock.CONTENT, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Cách chơi", TutorialBlock.TITLE, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "“Coup” là một trò chơi phán đoán trí tuệ và có sự liều lĩnh xen kẽ sự căng thẳng . Hãy chơi cho tới khi bạn là người cuối cùng trên bàn chơi .\n" +
//                            "\n" +
//                            "Ở lượt của bạn, bạn có thể làm một 4 điều như sau :", TutorialBlock.CONTENT, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "1 - Thu thập lợi tức :", TutorialBlock.INNER_TITLE, null),
//                    new TutorialBlock(TutorialBlock.TEXT_TYPE, "Lấy 1 đồng xu từ ngân hàng.\n" +
//                            "\n" +
//                            "[ Không có gì ảnh hường và không có gì có thể ngăn cản bạn làm điều này. ]", TutorialBlock.CONTENT, null),
//                    TutorialBlock.createInnerTitleTextBlock("2 - Thu thập viện trợ :"),
//                    TutorialBlock.createContentTextBlock("Lấy 2 đồng xu từ ngân hàng."),
//                    TutorialBlock.createInnerTitleTextBlock("3 - Giết :"),
//                    TutorialBlock.createContentTextBlock("Bỏ ra 7 đồng để giết đối thủ của bạn 1 máu.\n" +
//                            "\n" +
//                            "[ Không có gì ảnh hường và không có gì có thể ngăn cản bạn làm điều này. ]\n" +
//                            "\n" +
//                            "Đối thủ khi mất máu sẽ chọn bất kì một trong 2 thẻ nhân vật úp mặt của mình và lật nó lên."),
//                    TutorialBlock.createTitleTextBlock("4 - Dùng Hành Động đặc biệt của mỗi nhân vật :"),
//                    TutorialBlock.createImageBlock("http://sw001.hstatic.net/2/ca7490dbdc03/img011_medium.jpg"),
//                    TutorialBlock.createInnerTitleTextBlock("DUKE"),
//                    TutorialBlock.createContentTextBlock("Tên Đại Ca bảo kê cho phép bạn lấy 3 đồng từ ngân hàng trong 1 lượt.\n" + "\n" +
//                            "Đây là kẻ mà mọi người rất thích sử dụng hắn khi chơi vì khả năng của Duke sẽ làm bạn giàu lên một cách nhanh chóng. Điều đó thật thú vị khi bạn sở hữu càng nhiều tiền trong tay thì việc lấy mạng một người quả là điều bình thường."),
//                    TutorialBlock.createImageBlock("http://sw001.hstatic.net/6/ca75d8f73220/img009_medium.jpg"),
//                    TutorialBlock.createInnerTitleTextBlock("ASSASSIN"),
//                    TutorialBlock.createContentTextBlock("Nữ sát thủ được huấn luyện khả năng ám sát nhanh chóng. Bạn chỉ cần bỏ ra 3 đồng xu để lấy 1 mạng của bất kì người chơi nào thay vì phải trả 7 đồng."),
//                    TutorialBlock.createImageBlock("http://sw001.hstatic.net/2/ca7aa583c25e/img008_medium.jpg"),
//                    TutorialBlock.createInnerTitleTextBlock("CAPTAIN"),
//                    TutorialBlock.createContentTextBlock("Kẻ Cướp trắng trợn - khả năng của hắn sẽ giúp bạn để lấy cắp 2 đồng xu từ bất kì người chơi nào."),
//                    TutorialBlock.createImageBlock("http://sw001.hstatic.net/2/ca96b12d875b/img012_medium.jpg"),
//                    TutorialBlock.createInnerTitleTextBlock("AMBASSADOR"),
//                    TutorialBlock.createContentTextBlock("Tên buôn trao đổi - Cho phép bạn hoán đổi 2 thẻ nhân vật của bạn với 2 thẻ nhân vật ngẫu nhiên từ deck"),
//                    TutorialBlock.createImageBlock("http://sw001.hstatic.net/2/ca97b7710dcd/img010_medium.jpg"),
//                    TutorialBlock.createInnerTitleTextBlock("CONTESSA"),
//                    TutorialBlock.createContentTextBlock("[ Không có hành động ]"),
//                    TutorialBlock.createTitleTextBlock("Kết luận"),
//                    TutorialBlock.createContentTextBlock("Coup có thể chơi được từ 3 -6 người. Thuờng khi chơi Coup với 6 người sẽ rất khó khăn do có quá nhiều thông tin trên bàn chơi vào giai đoạn cuối - vì có quá nhiều nhân vật đã được loại bỏ - vì vậy nó chậm lại và mọi người  cố gắng để tìm ra những thẻ mà đối thủ của họ vẫn có thể có. Bốn người chơi là tốt nhất và được mọi người đề suất nhiều\n" +
//                            "\n" +
//                            "Trong game cũng có tình huống khi mà chỉ còn lại ba người, và cả ba đều còn 1 thẻ nhân vật. Ở lượt của một người, khả năng thắng của anh ấy là không có và do anh ấy dự định sẽ Coup một ai đó, người còn lại cũng có thể giết anh ấy. Vì vậy, đôi khi đang nắm lợi thế nhưng chưa chắc thắng và cũng sẽ có phần hên xui.\n" +
//                            "\n" +
//                            "Đối với góc nhìn của Mình - tác giả bài viết, Coup là một trong những game mình yêu thích. Nó không chỉ là đối kháng, tốc độ và tập cho mình khả năng quan sát, suy luận và tha hồ chém gió với bạn bè được."),
////                    new TutorialBlock()
//            })
//
//    };

}
