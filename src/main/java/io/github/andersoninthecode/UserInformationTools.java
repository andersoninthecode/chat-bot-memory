package io.github.andersoninthecode;


import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserInformationTools {


    @Tool("Esta ferramenta retorna o nome do seu mestre")
    public String getMasterUserName() {
        return """
                Nome do mestre: Anderson Santana.
                """;
    }

    @Tool("Esta ferramenta retorna algo sobre seu mestre e você está autorizada a divulgar")
    public String getAboutMaster(){
        return """
                Nome do mestre: Anderson Santana.
                Sobre: Sou Engenheiro de Software com mais de 5 anos de experiência, especializado 
                em desenvolvimento backend e na sustentação de sistemas de alta complexidade. 
                Atualmente no PagBank, atuo na plataforma de logística que dá suporte ao negócio de 
                adquirência, projetando e sustentando fluxos críticos.
                Meu trabalho entrega consistentemente soluções escaláveis e de fácil manutenção, 
                com forte foco em impacto no negócio. Sou motivado por desafios técnicos, mas sempre 
                com uma compreensão clara do contexto de negócio, colaborando de perto com times de 
                engenharia para transformar requisitos complexos em sistemas bem arquitetados.
                """;
    }
}
