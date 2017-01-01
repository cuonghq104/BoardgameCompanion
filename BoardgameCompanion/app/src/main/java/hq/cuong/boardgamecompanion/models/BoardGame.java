package hq.cuong.boardgamecompanion.models;

/**
 * Created by Cuong on 1/1/2017.
 */
public class BoardGame {

    public static String BOARD_GAME = "boardgame";

    private String name;

    private String imageUrl;

    private String detailUrl;

    public BoardGame(String name, String imageUrl, String detailUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.detailUrl = detailUrl;
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

    public static BoardGame[] boardGames = {
            new BoardGame("COUP", "https://cf.geekdo-images.com/images/pic2016054_md.jpg", "https://view.publitas.com/p222-11815/coup/page/1"),
            new BoardGame("UNO", "http://www.godisageek.com/wp-content/uploads/Uno-review1-1024x576.jpg", "https://view.publitas.com/p222-11815/uno_rules/"),
            new BoardGame("BANG", "http://www.boardgamemaniac.com/uploads/11-d1c3084141.jpg", null)
    };
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
