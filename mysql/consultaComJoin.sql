select
    c.nome as Cidade,
    e.nome as Estado,
    e.regiao as Região 
    from  estados e ,cidades c  
where e.id = estado_id;

select 
    c.nome as Cidade,
    e.nome as Estado,
    e.regiao as Região 
    from estados e
    inner join   cidades c 
on e.id = estado_id;