package day5.T08图书系统;

public class BookManger {
    Book[] books=new Book[100];
    //图书初始化
    public void bookinit(){
        books[0]=new Book();
        books[0].bookname="阿泰勒的角落";
        books[0].author="李娟";
        books[0].price=45.7;
        books[1]=new Book();
        books[1].bookname="平凡的世界";
        books[1].author="路遥";
        books[1].price=55.0;
    }
    //图书列表
    public void bookList(){
        for (int i=0;i<books.length;i++){
            if(books[i]!=null){
                System.out.println(books[i].bookname+"\t\t"+books[i].author+"\t\t"+books[i].price);
            }
        }
    }
    //图书添加
    public boolean bookadd(Book books1){
        boolean flag=false;
        for(int j=0;j<books.length;j++){
            if(books[j]==null){
                books[j]=books1;
                flag=true;
                break;
            }
        }
        return flag;
    }

}
