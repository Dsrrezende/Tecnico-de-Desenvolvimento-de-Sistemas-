# Analise de Requisitos Hotel Patinhas

## Stakeholders
+ Tutores dos Pets. 
+ Cuidadores do Hotel. 
+ Pets hospedados. 

## Requisitos Funcionais
1- O sistema deve permitir o cadastro de pets, incluindo informações de saúde, alimentação, alergias e horários de medicação.

2- O sistema deve permitir o cadastro de tutores, com informações de contato e preferências de comunicação.

3- O sistema deve permitir agendar hospedagens e serviços do hotel.

4- O sistema deve exibir automaticamente a agenda diária do pet durante a estadia (remédios, alimentação e atividades).

5- O sistema deve exibir notificações internas para os cuidadores com horários de medicação.

6- O sistema deve permitir enviar atualizações do pet (fotos, vídeos e mensagens) diretamente para o tutor através do aplicativo.

7- O sistema deve gerar atualizações em massa (ex: mandar foto para todos os tutores de uma turma da creche de uma vez).

8- O sistema deve registrar cada atividade feita com o pet (alimentação, caminhada, banho, brincadeiras, medicação).

9- O sistema deve permitir que o tutor acompanhe o status em tempo real do pet (ex: “Brincando”, “Dormindo”, “Alimentado às 14h”).

10- O sistema deve gerar relatórios de hospedagem para o tutor no check-out (refeições, remédios, atividades).

11- O sistema deve armazenar o histórico do pet.

12- O sistema deve permitir anexar documentos.

13- O sistema só deve conceder acesso as informações do pet ao respectivo tutor.

## Requisitos não Funcionais
1- O sistema deve estar disponível 24 horas por dia, 7 dias por semana.

2- O aplicativo para tutores deve ser intuitivo.

3- O tempo de carregamento de qualquer tela não deve exceder 2 segundos.

4- O envio de fotos e vídeos deve ser carregado em até 5 segundos em redes 4G/5G.

5- O sistema deve criptografar todas as informações de saúde e dados pessoais (LGPD).

6- As fotos e vídeos devem ser armazenados em servidor seguro com controle de acesso.

7- O sistema deve suportar pelo menos 500 pets cadastrados e 100 tutores acessando simultaneamente.

8- O sistema deve permitir funcionamento em celulares Android e iOS.

9- O sistema deve gerar relatórios de atividades para auditorias internas.

10- O sistema deve manter sessões autenticadas por, no máximo, 6h.

11- O backup de dados deve ser feito diariamente.

12- O sistema deve controlar acessos por papéis de usuário (administrador, cuidador, recepcionista, tutor).

## Regras de Negócios

1- O pet só pode ser hospedado se a carteira de vacinação estiver atualizada.

2- Medicamentos só podem ser ministrados mediante receita veterinária anexada.

3-Cancelamentos de reserva só podem ser feitos com até 24h de antecedência.

4- O tutor deve concordar com termos de responsabilidade antes do check-in.

5- solicitações de banho ao check-out somente com antecedencia de 2 horas antes da saída.

6- Somente cuidadores autorizados podem administrar medicação.

7- Atualizações diárias obrigatórias: no mínimo 1 foto por período (manhã, tarde, noite).

8- Em caso de emergência médica, o hotel deve contatar o tutor imediatamente e registrar no sistema.

9- Tutores não podem visualizar informações de outros pets além do próprio.

10- Cada atividade registrada no sistema deve conter data, hora.