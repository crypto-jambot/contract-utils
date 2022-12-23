package dev.rabbit.generated;

import java.math.BigInteger;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class UnsafeMathEchidnaTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5060dd8061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80632724da4e14602d575b600080fd5b604d60048036036040811015604157600080fd5b5080359060200135604f565b005b60008111605b57600080fd5b600060658383609c565b90506000828481607157fe5b0482039050828481607e57fe5b06608d578015608957fe5b6096565b80600114609657fe5b50505050565b80820491061515019056fea2646970667358221220db9a4c7195b02f51ffc92d45750e9cc280db173e6a6fcf05142dd908fee743e464736f6c63430007060033";

    public static final String FUNC_CHECKDIVROUNDINGUP = "checkDivRoundingUp";

    @Deprecated
    protected UnsafeMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UnsafeMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected UnsafeMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected UnsafeMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static UnsafeMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnsafeMathEchidnaTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static UnsafeMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UnsafeMathEchidnaTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static UnsafeMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new UnsafeMathEchidnaTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UnsafeMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new UnsafeMathEchidnaTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<UnsafeMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UnsafeMathEchidnaTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UnsafeMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UnsafeMathEchidnaTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<UnsafeMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UnsafeMathEchidnaTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UnsafeMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UnsafeMathEchidnaTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
