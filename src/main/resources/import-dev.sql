
insert into compromisso (id, descricao, periodo, duracao) values (1, 'java', 's', '10h');
insert into compromisso (id, descricao, periodo, duracao) values (2, 'angular', 's', '2h');

insert into timeline (id, descricao, data_inicial, data_final, fk_compromisso)
    values (1, 'teste1', '2016-01-25T21:34:55', '2016-01-25T22:34:55', 1);
insert into timeline (id, descricao, data_inicial, data_final, fk_compromisso)
    values (2, 'teste2', '2016-01-25T21:34:55', '2016-01-25T23:34:55', 2);
insert into timeline (id, descricao, data_inicial, data_final, fk_compromisso)
    values (3, 'teste3', '2016-01-25T21:34:55', '2016-01-26T21:34:55', 1);
insert into timeline (id, descricao, data_inicial, data_final, fk_compromisso)
    values (4, 'teste4', '2016-01-25T21:34:55', '2016-02-25T21:34:55', null);
insert into timeline (id, descricao, data_inicial, data_final, fk_compromisso)
    values (5, 'teste5', '2016-01-25T21:34:55', '2016-01-29T21:34:55', null);
