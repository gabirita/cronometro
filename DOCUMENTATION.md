# Documentação do Projeto "Cronômetro para Estudos"

## Introdução
O projeto "Cronômetro para Estudos" foi desenvolvido para ajudar os estudantes a gerenciar seu tempo de forma eficaz durante o estudo. O cronômetro oferece funcionalidades simples de iniciar, pausar, retomar e reiniciar a contagem do tempo. Este projeto foi desenvolvido utilizando **Java** e foi gerenciado com **Git** para controle de versão.

## Processo de Desenvolvimento

### Etapas do Desenvolvimento
1. **Planejamento**: O projeto foi planejado com base nas funcionalidades essenciais de um cronômetro de estudos, com opções de controle de tempo (iniciar, pausar, retomar e reiniciar).
2. **Configuração do Ambiente**: O ambiente de desenvolvimento foi configurado no **Visual Studio Code** com suporte para Java. Também foi instalado o **Git** para controle de versão.
3. **Codificação das Funcionalidades**:
   - Implementação do menu principal com opções de controle do cronômetro.
   - Programação das funções para iniciar, pausar, retomar e reiniciar o cronômetro.
4. **Testes**: Após cada funcionalidade implementada, o código foi testado para garantir que o comportamento do cronômetro estava conforme esperado.
5. **Versionamento com Git**:
   - Inicialização do repositório Git com `git init`.
   - Uso de commits frequentes após o desenvolvimento de cada funcionalidade.
   - Criação de branches específicas para cada funcionalidade.
   - Utilização do `git merge` para integrar as funcionalidades à branch principal.
6. **Documentação e Apresentação**: O README.md foi atualizado para explicar o projeto e como usar o cronômetro, enquanto uma apresentação foi criada para explicar o desenvolvimento.

### Desafios Enfrentados

- **Gerenciamento do Tempo**: Manter o cronômetro em funcionamento corretamente com opções de pausa e retomada foi um dos maiores desafios. Foi necessário implementar a lógica que interrompe a contagem e retoma a partir de onde parou, sem perder o estado.
- **Interface no Terminal**: Trabalhar apenas com o terminal para o cronômetro foi desafiador em termos de interação visual. No futuro, seria interessante implementar uma interface gráfica (GUI) para tornar o cronômetro mais amigável.
- **Controle de Versão com Git**: Durante o desenvolvimento, surgiram situações em que o gerenciamento de branches foi crucial. O uso de commits frequentes foi essencial para garantir que nenhuma funcionalidade fosse perdida.

### Como o Git Ajudou no Desenvolvimento
O uso do **Git** foi essencial para manter o projeto organizado e facilitar o gerenciamento das mudanças. Aqui estão algumas formas como o Git foi utilizado:
- **Controle de Versão**: A cada nova funcionalidade ou alteração no código, um commit foi feito para documentar as mudanças.
- **Branches**: Foram criadas branches específicas para o desenvolvimento de funcionalidades, como `feature-pause` e `feature-start`, permitindo trabalhar em diferentes partes do projeto sem interferir no código principal.
- **Merge**: Após a implementação de cada funcionalidade, as branches foram mescladas na branch principal (`main`), garantindo que o código principal estivesse sempre atualizado.

## Conclusão
O desenvolvimento do "Cronômetro para Estudos" foi uma experiência enriquecedora, onde o uso do Git para controle de versão ajudou a organizar o fluxo de trabalho e a facilitar a colaboração no desenvolvimento das funcionalidades. O cronômetro está funcional e atende às necessidades básicas de controle de tempo para estudos.

Futuras melhorias podem incluir:
- Adicionar uma interface gráfica para tornar o cronômetro mais interativo.
- Implementar uma função de salvar sessões de estudo.
