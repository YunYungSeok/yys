package test1;
  
interface Image {                      //�̹��� �������̽� ����
     public void displayImage();
}
 
//on System A 
class RealImage implements Image {
 
    private String filename = null;
    // ������
    public RealImage(final String FILENAME) { 
        filename = FILENAME;
        loadImageFromDisk();
    }
    // ��ũ�κ��� �̹��� �ε�
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
    // �̹��� ǥ�� (�������̵�)
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
}

class FakeImage extends RealImage {
	public FakeImage(final String FILENAME) {
		super(FILENAME);
	}
}

// B �ý��ۿ���
class ProxyImage implements Image {
 
    private Image image = null;
    private String filename = null;
    
    public ProxyImage(Image IMAGE1) {
		this.image=IMAGE1;//
	}

	public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    // �̹��� ��� (�������̵�)
    public void displayImage() {
    	System.out.println("call target object " + image.getClass().getName());
        image.displayImage();
    }
 
}
 
class ProxyExample {
 
   // �׽�Ʈ �޼ҵ�
   public static void main(String[] args) {
        final Image IMAGE1 = new RealImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage(IMAGE1);

        final Image IMAGE3 = new FakeImage("dasd");
        final Image IMAGE4 = new ProxyImage(IMAGE3);
        
        IMAGE1.displayImage(); // loading necessary  
        IMAGE1.displayImage(); // loading unnecessary  // �ι�°�� �ѱ�� ���� �ֱ⶧����
        IMAGE2.displayImage(); // loading necessary
        IMAGE2.displayImage(); // loading unnecessary
        IMAGE1.displayImage(); // loading unnecessary
        IMAGE3.displayImage();
        IMAGE4.displayImage();
   
   }
}
