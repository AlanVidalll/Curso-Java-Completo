alter table empresas modify cnpj varchar(14);



insert into empresas 
(nome,cnpj)
values
('bradesco',64545784132589),
('Vale',45646645464646),
('Cielo',31535445454544);


desc empresas;
select * from empresas;
select * from cidades;

insert into empresas_unidade
(empresa_id,cidade_id,sede)
values
(1,1,1),
(1,3,0),
(2,1,0),
(2,3,1);


 select * from empresas_unidade;