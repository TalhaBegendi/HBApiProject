Projeyi direk File/Open ile açabilirsiniz.

Log4j klasöründe loglar kaydedilecektir.

Mock api için https://github.com/typicode/json-server 
jsonserver kullandım. 
Not: Test edilmek istendiğinde db.json dosyası içersindeki
posts --> getProducts ile değiştirilmelidir.

TestClass içersinde Post, Put, Delete, Get methodları mevcuttur

Delete Method: Id girilerek ilgili data silinebilir

Get Method: 2 tane mevcut. Birisi tüm Productları getiriyor,
diğeri tek bir Product getiriyor. Id'sini input yapabiliriz.

Post Method: Body için tüm datalar girilerek post işlemi yapılabilirsiniz.

Put Method: Body için tüm datalar girilerek post işlemi yapılabilirsiniz.