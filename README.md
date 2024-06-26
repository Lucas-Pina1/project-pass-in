# Pass.in - Gestão de Participantes em Eventos Presenciais

O Pass.in é uma aplicação de gestão de participantes em eventos presenciais, fornecendo uma solução abrangente para organizadores e participantes. Com recursos para cadastro de eventos, inscrições de participantes e emissão de credenciais, o Pass.in simplifica o processo de gerenciamento de eventos.

## Funcionalidades

- Cadastro de Eventos: Os organizadores podem facilmente cadastrar novos eventos.
- Página de Inscrição: O sistema gera automaticamente uma página pública de inscrição para cada evento.
- Emissão de Credenciais: Os participantes podem emitir suas credenciais para check-in no dia do evento.
- Check-in com QRCode: O check-in no evento é feito de forma conveniente através de um QRCode.

## Requisitos

### Requisitos Funcionais

1. Cadastro de Evento: Os organizadores podem cadastrar novos eventos.
2. Visualização de Dados do Evento: Os organizadores podem visualizar dados detalhados de cada evento.
3. Lista de Participantes: Os organizadores têm acesso à lista de participantes inscritos em cada evento.
4. Inscrição em Eventos: Os participantes podem se inscrever nos eventos disponíveis.
5. Visualização de Crachá: Os participantes podem visualizar e imprimir seus crachás de inscrição.
6. Check-in no Evento: Os participantes podem realizar o check-in no evento no dia programado.

### Regras de Negócio

- Restrição de Inscrição Única: Cada participante só pode se inscrever uma vez em cada evento.
- Vagas Disponíveis: Os participantes só podem se inscrever em eventos com vagas disponíveis.
- Check-in Único: Cada participante só pode realizar o check-in uma vez em cada evento.

### Requisitos Não-Funcionais

- Check-in via QRCode: O sistema utiliza QRCode para facilitar o processo de check-in no evento.
