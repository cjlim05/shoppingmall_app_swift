import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Dessert extends JPanel {
    private Order orderedPanel;

    // Ordered 객체를 전달받는 생성자
    public Dessert(Order orderedPanel) {
        this.orderedPanel = orderedPanel;
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setBackground(Color.PINK);

        // 디저트 메뉴 항목 추가
        addMenuItem("베이글", "5000원", "bagel.png");
        addMenuItem("마카롱", "3000원", "macaron.png");
        addMenuItem("브라우니", "3500원", "brownie.png");
        addMenuItem("쿠키", "2000원", "cookie.png");

        setPreferredSize(new Dimension(500, 1500));
    }

    // 메뉴 항목을 추가하는 메서드
    private void addMenuItem(String name, String price, String imagePath) {
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BorderLayout());
        itemPanel.setPreferredSize(new Dimension(150, 200));

        // 이미지 로드 및 크기 조정
        ImageIcon originalIcon = new ImageIcon("src/images/" + imagePath); // 이미지 로드
        Image image = originalIcon.getImage(); // Image 객체로 변환
        Image resizedImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH); // 크기 조정
        ImageIcon resizedIcon = new ImageIcon(resizedImage); // 조정된 이미지로 ImageIcon 생성

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(resizedIcon); // 크기 조정된 이미지를 JLabel에 설정
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        JLabel priceLabel = new JLabel(price, SwingConstants.CENTER);

        itemPanel.add(imageLabel, BorderLayout.CENTER);
        itemPanel.add(nameLabel, BorderLayout.NORTH);
        itemPanel.add(priceLabel, BorderLayout.SOUTH);

        // 클릭 리스너
        itemPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, name + "를(을) 선택하셨습니다.");
                processOrder(name, price);
            }
        });

        add(itemPanel);
    }


    // 주문 처리 메서드
    public void processOrder(String name, String price) {
        if (orderedPanel != null) {
            orderedPanel.addOrder(name, price); // 주문을 처리하는 메서드
        } else {
            System.err.println("Ordered panel is null.");
        }
    }
}
