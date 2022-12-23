package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
public class NoDelegateCallTest extends Contract {
    public static final String BINARY = "60a060405234801561001057600080fd5b5030606081901b6080526101546100306000398060ec52506101546000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80633045a6e01461005c5780633c7c8dd014610076578063423ecb051461007e5780636427016414610086578063f45f416e14610090575b600080fd5b610064610098565b60408051918252519081900360200190f35b6100646100af565b6100646100b9565b61008e6100cd565b005b6100646100d7565b6000805a90506100a66100d7565b505a9003905090565b6000805a90506100a65b60006100c36100e1565b6005425b04905090565b6100d5610116565b565b60006005426100c7565b306001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016146100d557600080fd5b6100d56100e156fea264697066735822122094f26775f8133fcc975d1ef05fcdc0d9607fe386bd4ab6aeea99d83bd4e31aff64736f6c63430007060033";

    public static final String FUNC_CALLSINTONODELEGATECALLFUNCTION = "callsIntoNoDelegateCallFunction";

    public static final String FUNC_CANBEDELEGATECALLED = "canBeDelegateCalled";

    public static final String FUNC_CANNOTBEDELEGATECALLED = "cannotBeDelegateCalled";

    public static final String FUNC_GETGASCOSTOFCANBEDELEGATECALLED = "getGasCostOfCanBeDelegateCalled";

    public static final String FUNC_GETGASCOSTOFCANNOTBEDELEGATECALLED = "getGasCostOfCannotBeDelegateCalled";

    @Deprecated
    protected NoDelegateCallTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected NoDelegateCallTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected NoDelegateCallTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected NoDelegateCallTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> canBeDelegateCalled() {
        final Function function = new Function(FUNC_CANBEDELEGATECALLED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> cannotBeDelegateCalled() {
        final Function function = new Function(FUNC_CANNOTBEDELEGATECALLED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfCanBeDelegateCalled() {
        final Function function = new Function(FUNC_GETGASCOSTOFCANBEDELEGATECALLED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfCannotBeDelegateCalled() {
        final Function function = new Function(FUNC_GETGASCOSTOFCANNOTBEDELEGATECALLED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static NoDelegateCallTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new NoDelegateCallTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static NoDelegateCallTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new NoDelegateCallTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static NoDelegateCallTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new NoDelegateCallTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static NoDelegateCallTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new NoDelegateCallTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<NoDelegateCallTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(NoDelegateCallTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<NoDelegateCallTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(NoDelegateCallTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<NoDelegateCallTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(NoDelegateCallTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<NoDelegateCallTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(NoDelegateCallTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
