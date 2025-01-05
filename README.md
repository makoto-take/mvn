

## sonarqube の実行

tokenを確認して以下を実行するか、~/.bashrc に設定しておく。
```
export SONARQUBE_TOKEN_MVN=your_sonar_token
```

```
mvn clean verify sonar:sonar -Dsonar.token=$SONARQUBE_TOKEN_MVN
```
