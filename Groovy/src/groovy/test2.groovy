package groovy;
class Book2 {
  String title
}
Book2.metaClass.getAuthor << {-> "Stephen King" }

def b = new Book2()

assert "Stephen King" == b.author
if("Stephen King" == b.author){
	print("true")
}