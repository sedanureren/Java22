--Select
Select ContactName Adi, CompanyName SirketAdi,City sehir from Customers
Select* from Customers where City='Berlin'
--case insensitive
select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>=10
select * from Products order by UnitPrice asc--ascending
select * from Products order by UnitPrice desc--descending
select * from Products where CategoryID=1 order by UnitPrice desc--descending

Select count(*) Adet from Products where CategoryID=2--tüm satırları say

select categoryId,count(*) from Products where UnitPrice>=20 group by CategoryID having count(*)<10

select  Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryID
from Products inner join Categories
on Products.CategoryID=Categories.CategoryID

--oto data transformation object
Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID inner join Orders o on o.OrderID=od.OrderID
Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID
Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID 
Select * from Customers c inner join Orders o on c.CustomerID=o.CustomerID
Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is Null--siparişi olmayan müşteri
Select * from Customers c right join Orders o on c.CustomerID=o.CustomerID























